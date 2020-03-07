__command() -> (
    print('/netherUtils tpOverworld');
    print('tpOverworld sends you to your current x and z times 8 in the overworld');
);

tpOverworld() -> (
    run(str('/execute in overworld run tp @p %d 100 %d', floor(query(player(),'x'))*8, floor(query(player(),'z'))*8));
);

tpNether() -> (
    run(str('/execute in the_nether run tp @p %d 130 %d', floor((query( player(),'x' ) *8)/8)/8, floor( (query( player(),'z' ) *8)/8 )/8));
);

tpNearestCompatable() -> (
    x = query(player() , 'x');
    z = query(player(), 'z');

    run(str('tp @s %d 100 %d', floor( x /8 )*8, floor( z /8)*8));
);

tpOther(p2) -> (
    x = query(player(), 'x');
    z = query(player(), 'z');
    yaw = query(player(), 'yaw');
    pitch = query(player(), 'pitch');

    if(query(player(), 'dimension') == 'overworld',
        run(str('/execute as %s in the_nether run tp @s %d 138 %d %d %d', p2, floor(x)/8, floor(z)/8, yaw, pitch));
    , query(player(), 'dimension') == 'the_nether',
        run(str('/execute as %s in overworld run tp @s %d 100 %d %d %d', p2, floor(x)*8, floor(z)*8, yaw, pitch));
    )
);