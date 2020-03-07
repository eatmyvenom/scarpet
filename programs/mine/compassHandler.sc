__command() -> (

    pitch = query(player(),'pitch');

    run(str('/execute as @s at Ricelife01 facing entity EatMyVenom eyes run tp @s ~ ~ ~ ~ %f', pitch));
);