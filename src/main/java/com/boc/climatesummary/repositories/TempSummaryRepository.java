package com.boc.climatesummary.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boc.climatesummary.domain.TempSummary;

@Repository
public interface TempSummaryRepository extends CrudRepository<TempSummary, Integer>
{

}