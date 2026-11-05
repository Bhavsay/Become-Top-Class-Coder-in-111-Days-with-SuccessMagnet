# Write your MySQL query statement below
select product_id, year as first_year, quantity, price from sales as a
where (product_id, year) in (
    select
        product_id,
        min(year)
    from sales as a
    group by product_id
);