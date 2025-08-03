Select U.unique_id , E.name from Employees E
left join EmployeeUNI U on U.id = E.id;