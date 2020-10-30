package com.boc.climatesummary.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boc.climatesummary.repositories.TempSummaryRepository;
import com.boc.climatesummary.domain.TempSummary;

@Controller
public class ClimateSummaryController
{
    @Autowired TempSummaryRepository tempSummaryRepository;
 
    private static final Logger logger = LogManager.getLogger(ClimateSummaryController.class);
    
    @RequestMapping("/")
    public String getAllTempSummary(Model model)
    {
    	
    	Iterable<TempSummary> tempList = tempSummaryRepository.findAll();
    	List<TempSummary> tempSummary  = StreamSupport.stream(tempList.spliterator(), false)
    		      .map(t->setDateFormat(t))
    		      .collect(Collectors.toList());
    	  logger.trace("A TRACE Message");
          logger.debug("A DEBUG Message");
          logger.info("An INFO Message");
          logger.warn("A WARN Message");
          logger.error("An ERROR Message");
        model.addAttribute("temp_summary", tempSummary);
        
        return "index";
    }
    
    private TempSummary setDateFormat(TempSummary t) {
    	t.setDateStr(new SimpleDateFormat("yyyy-MM-dd").format(t.getDate()));
		return t;
	}

	@GetMapping("/details/{id}")
    public String getTempSummaryDetails(@PathVariable("id") int id, Model model) {
       Optional<TempSummary> summary = tempSummaryRepository.findById(id);
       DateFormat newDate = new SimpleDateFormat("yyyy-MM-dd");
       model.addAttribute("dateStr",newDate.format(summary.get().getDate()));
       model.addAttribute("summary",summary.get());
        return "view";
    }
}