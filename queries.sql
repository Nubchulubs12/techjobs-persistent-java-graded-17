--Part 1
--# Field, Type, Null, Key, Default, Extra
--'id', 'int(11)', 'NO', 'PRI', NULL, ''
--'employer', 'varchar(255)', 'YES', '', NULL, ''
--'name', 'varchar(255)', 'YES', '', NULL, ''
--'skills', 'varchar(255)', 'YES', '', NULL, ''
--'skill', 'varchar(255)', 'YES', '', NULL, ''

--Part 2
SELECT name
From employer
Where location = "St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
SELECT *
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;