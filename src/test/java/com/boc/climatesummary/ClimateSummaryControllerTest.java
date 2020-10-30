/*
 * package com.boc.climatesummary;
 * 
 * import static org.junit.Assert.assertNotNull;
 * 
 * import java.sql.SQLException;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.junit.jupiter.api.extension.ExtendWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.web.client.TestRestTemplate; import
 * org.springframework.boot.web.server.LocalServerPort; import
 * org.springframework.core.io.ClassPathResource; import
 * org.springframework.http.HttpEntity; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.jdbc.datasource.init.ScriptException; import
 * org.springframework.jdbc.datasource.init.ScriptUtils; import
 * org.springframework.test.context.junit.jupiter.SpringExtension;
 * 
 * import com.boc.climatesummary.controller.ClimateSummaryController; import
 * com.boc.climatesummary.domain.TempSummary; import
 * com.boc.climatesummary.repositories.TempSummaryRepository;
 * 
 * 
 * @ExtendWith(SpringExtension.class)
 * 
 * @SpringBootTest(classes = TempSummaryRepository.class, webEnvironment =
 * SpringBootTest.WebEnvironment.RANDOM_PORT) public class
 * ClimateSummaryControllerTest {
 * 
 * @Autowired private TestRestTemplate restTemplate;
 * 
 * @Autowired private JdbcTemplate jdbc;
 * 
 * @LocalServerPort private int port;
 * 
 * private String getRootUrl() { return "http://localhost:" + port; }
 * 
 * @Before public void before() throws ScriptException,SQLException{
 * ScriptUtils.executeSqlScript(jdbc.getDataSource().getConnection(), new
 * ClassPathResource("/before.sql")); }
 * 
 * @After public void after() throws ScriptException,SQLException{
 * ScriptUtils.executeSqlScript(jdbc.getDataSource().getConnection(), new
 * ClassPathResource("/after.sql")); }
 * 
 * @Test public void contextLoads() {
 * 
 * }
 * 
 * @Test public void testGetAllTempSummary() { HttpHeaders headers = new
 * HttpHeaders(); HttpEntity<String> entity = new HttpEntity<String>(null,
 * headers);
 * 
 * ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/",
 * HttpMethod.GET, entity, String.class);
 * 
 * assertNotNull(response.getBody()); }
 * 
 * @Test public void testGetTempSummaryDetails() { TempSummary tempSummary =
 * restTemplate.getForObject(getRootUrl() + "/details/1", TempSummary.class);
 * System.out.println(tempSummary.getStationName()); assertNotNull(tempSummary);
 * }
 * 
 * }
 */