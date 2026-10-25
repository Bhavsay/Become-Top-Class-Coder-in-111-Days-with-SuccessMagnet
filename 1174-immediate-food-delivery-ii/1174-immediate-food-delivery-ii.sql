# Write your MySQL query statement below
select
    ROUND(
        100.0 * sum(case when order_date = customer_pref_delivery_date then 1 else 0 END) / COUNT(*), 
        2
    ) as immediate_percentage
from Delivery
where (customer_id, order_date) in (
    select customer_id, MIN(order_date)
    from Delivery
    group by customer_id
);