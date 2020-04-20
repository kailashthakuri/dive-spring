DELIMITER $$
create function fnGetActorNameById(in_id int)
RETURNS varchar(100)
BEGIN
   declare out_name varchar(100);
   select name into out_name from actor where id= in_id;
   return out_name;
END $$
DELIMITER ;
