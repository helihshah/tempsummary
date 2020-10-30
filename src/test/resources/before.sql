CREATE TABLE temp_summary (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  Station_name varchar(250) NOT NULL,
  Province varchar(45) NOT NULL,
 Date date NOT NULL,
  Mean_Temp decimal(3,1) DEFAULT NULL,
  Highest_Monthly_Maxi_Temp decimal(3,1) DEFAULT NULL,
  Lowest_Monthly_Min_Temp decimal(3,1) DEFAULT NULL,
  Date_str varchar(45) DEFAULT NULL
);

 INSERT INTO temp_summary (id, Station_name, Province, Date, Mean_Temp, Highest_Monthly_Maxi_Temp, Lowest_Monthly_Min_Temp, Date_str) VALUES ('1', 'CHEMAINUS', 'BC', '2018-01-04', '15.1', '26.5', '7','');