# Write your MySQL query statement below
Select SalesPerson.name
from orders
inner join company
on(Orders.com_id =Company.com_id AND Company.name='RED')
RIGHT JOIN SalesPerson
USING (Sales_id)
WHERE Orders.sales_id IS NULL;