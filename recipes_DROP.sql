alter table Recipe drop constraint FK_l4krtn51clx6n805racc17fep
alter table recipe_ingredient drop constraint FK_thghmqhlim0p7i6auo6kfmxwo
alter table recipe_ingredient drop constraint FK_tmcdw7h1sgbnmr3tab1ccbb49
drop table if exists Ingredient cascade
drop table if exists Recipe cascade
drop table if exists meal_type cascade
drop table if exists recipe_ingredient cascade
drop sequence hibernate_sequence
drop sequence mealtype_seq
