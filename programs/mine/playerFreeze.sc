global_free = true;
global_oldtime = 0;

__on_tick() -> (
    mainp = player('EatMyVenom');
    other = 'Ricelife01';
    p2 = player(other);

    if(query(mainp,'trace',200 ,'entities') == other, 
        particle_line('smoke', query(mainp,'pos'), query(p2,'pos'));
        global_free = false;
        global_oldtime = tick_time();
    );

    freeze(p2);
);

freeze(player) -> (
    if(global_free==false,
        
        newx = (query(player, 'x'));
        newy = (query(player, 'y'));
        newz = (query(player, 'z'));
        modify(player, 'pos',  newx, newy, newz);
    );

    if(tick_time() > global_oldtime + 20,
            global_free = true;
    );
);

equip(player) -> (
    run(str('give %s diamond_helmet{Enchantments:[{id:protection,lvl:4},{id:respiration,lvl:3},{id:aqua_affinity,lvl:1},{id:unbreaking,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s diamond_chestplate{Enchantments:[{id:protection,lvl:4},{id:unbreaking,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s diamond_leggings{Enchantments:[{id:protection,lvl:4},{id:unbreaking,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s diamond_boots{Enchantments:[{id:protection,lvl:4},{id:feather_falling,lvl:4},{id:depth_strider,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s elytra{Enchantments:[{id:unbreaking,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s diamond_sword{Enchantments:[{id:sharpness,lvl:5},{id:knockback,lvl:2},{id:fire_aspect,lvl:2},{id:looting,lvl:3},{id:sweeping,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s trident{Enchantments:[{id:unbreaking,lvl:3},{id:loyalty,lvl:3},{id:impaling,lvl:5},{id:channeling,lvl:1}]} 1', player));

    run(str('give %s bow{Enchantments:[{id:unbreaking,lvl:3},{id:power,lvl:5},{id:punch,lvl:2},{id:flame,lvl:1},{id:infinity,lvl:1}]} 1', player));

    run(str('give %s crossbow{Enchantments:[{id:multishot,lvl:1},{id:quick_charge,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s crossbow{Enchantments:[{id:piercing,lvl:4},{id:quick_charge,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s arrow 128', player));

    run(str('give %s tnt 64', player));

    run(str('give %s diamond_axe{Enchantments:[{id:sharpness,lvl:5},{id:efficiency,lvl:5},{id:unbreaking,lvl:3},{id:fortune,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s diamond_pickaxe{Enchantments:[{id:efficiency,lvl:5},{id:unbreaking,lvl:3},{id:fortune,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s diamond_shovel{Enchantments:[{id:efficiency,lvl:5},{id:unbreaking,lvl:3},{id:fortune,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s flint_and_steel 1', player));

    run(str('give %s fishing_rod{Enchantments:[{id:unbreaking,lvl:3},{id:luck_of_the_sea,lvl:3},{id:lure,lvl:3},{id:mending,lvl:1}]} 1', player));

    run(str('give %s bucket 2', player));

    run(str('give %s firework_rocket 320', player));
);