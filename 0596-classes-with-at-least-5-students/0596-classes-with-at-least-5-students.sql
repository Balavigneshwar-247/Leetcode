# Write your MySQL query statement below
Select class from Courses
group by class HAVING COUNT(student) >= 5;