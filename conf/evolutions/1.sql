create table Ingredient (id int8 not null, name varchar(255), primary key (id))
create table Recipe (id int8 not null, add_date date, duration date, ingredients_desc varchar(255), name varchar(255), prepare_desc varchar(255), type varchar(255), primary key (id))
create table recipes_ingredients (recipes_id int8 not null, ingredients_id int8 not null)
alter table recipes_ingredients add constraint FK_nsmsbdni836dbjfepa4yxhjvx foreign key (ingredients_id) references Ingredient
alter table recipes_ingredients add constraint FK_leb4arj2ptk9i7rgj2mobmig0 foreign key (recipes_id) references Recipe
