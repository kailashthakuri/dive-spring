DELIMITER $$

create PROCEDURE spGetActorById(
  in in_id int,
  out out_name varchar(100),
  out out_age int,
  out out_dob date
)
BEGIN
  select name, age, dob
  into
  out_name,out_age,out_dob
  from actor where id= in_id;
END $$
DELIMITER ;