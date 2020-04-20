DELIMITER $$

create PROCEDURE spGetActorNameById(
  in  in_id int,
  out out_name varchar(30)
)
BEGIN
   select name
   into
   out_name
   from actor where id = in_id;
END $$
DELIMITER ;