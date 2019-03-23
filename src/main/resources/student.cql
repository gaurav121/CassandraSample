CREATE TABLE student(
  id int,
  name TEXT,
  student_id UUID,
  standard text,
  PRIMARY KEY ((id), standard, name)
) WITH CLUSTERING ORDER BY (standard DESC, name ASC);