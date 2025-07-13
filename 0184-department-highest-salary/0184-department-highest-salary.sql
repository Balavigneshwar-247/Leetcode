Select D.name as Department, E.name as Employee, E.salary as Salary from Employee E
join Department D ON E.departmentId = D.id
where
    (E.departmentId, E.salary) in (
        select departmentId, MAX(salary)
        from Employee
        group by departmentId
    );