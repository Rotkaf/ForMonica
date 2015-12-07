create table Ingredient (id int8 not null, name varchar(255), primary key (id))
create table Recipe (id int8 not null, add_date date, description varchar(255), primary key (id))
create table recipes_ingredients (ingredient_id int4 not null, recipe_id int4 not null, amount varchar(255), primary key (ingredient_id, recipe_id))
alter table recipes_ingredients add constraint FK_1r92khvcnda6p87twcjlt0w81 foreign key (ingredient_id) references Ingredient
alter table recipes_ingredients add constraint FK_52fr5jg71l6uqlmyp5csf0vs9 foreign key (recipe_id) references Recipe
