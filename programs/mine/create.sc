__command() -> (
    print('use this command to create special things.');
);

stacked_shulkers(amount) -> (
    p = player();
    x = p ~ 'x';
    y = p ~ 'y';
    z = p ~ 'z';
    loop(amount,
        run(str('/summon item %d %d %d {Item:{id:"shulker_box",Count:64b}}',x, y+5, z ));
    );
);