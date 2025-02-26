-- Part 1: Test it with SQL

--        Columns
--
--        id, integer (Primary Key)
--        employer, varchar(255)
--        name, varchar(255)
--        skills, varchar(255)

-- Part 2: Test it with SQL

--    write a query to list the names of the employers in St. Louis City. Do NOT specify an ordering for the query results.

--    SELECT name FROM employer WHERE location = "St. Louis City";

-- Part 3: Test it with SQL

--    write the SQL statement to remove the job table.

--    DROP TABLE job;


-- Part 4: Test it with SQL

--    write a query to return the names of all skills that are attached to jobs in alphabetical order.
--    If a skill does not have a job listed, it should not be included in the results of this query.

--SELECT name
--FROM skill
--INNER JOIN job ON skill.name = job.skills
