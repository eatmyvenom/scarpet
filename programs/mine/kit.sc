__command() -> (
    p = player();

    run(str('clear %s', p));

    inventory_set(p,0,1,'diamond_sword','{Enchantments:[{id:sharpness,lvl:5},{id:knockback,lvl:2},{id:fire_aspect,lvl:2},{id:looting,lvl:3},{id:sweeping,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');
    inventory_set(p,2,1,'bow','{Enchantments:[{id:unbreaking,lvl:3},{id:power,lvl:5},{id:punch,lvl:2},{id:flame,lvl:1},{id:infinity,lvl:1}]}');
    inventory_set(p,16,1,'arrow');
    inventory_set(p,29,1,'trident','{Enchantments:[{id:unbreaking,lvl:3},{id:loyalty,lvl:3},{id:impaling,lvl:5},{id:channeling,lvl:1}]}');

    inventory_set(p,1,1,'diamond_axe','{Enchantments:[{id:sharpness,lvl:5},{id:efficiency,lvl:5},{id:unbreaking,lvl:3},{id:fortune,lvl:3},{id:mending,lvl:1}]}');
    inventory_set(p,28,1,'diamond_pickaxe','{Enchantments:[{id:efficiency,lvl:5},{id:unbreaking,lvl:3},{id:fortune,lvl:3},{id:mending,lvl:1}]}');
    

    inventory_set(p,39,1,'diamond_helmet','{Enchantments:[{id:protection,lvl:4},{id:respiration,lvl:3},{id:aqua_affinity,lvl:1},{id:thorns,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');
    inventory_set(p,9,1,'diamond_helmet','{Enchantments:[{id:protection,lvl:4},{id:respiration,lvl:3},{id:aqua_affinity,lvl:1},{id:thorns,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');
    inventory_set(p,38,1,'diamond_chestplate','{Enchantments:[{id:protection,lvl:4},{id:thorns,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');
    inventory_set(p,10,1,'diamond_chestplate','{Enchantments:[{id:protection,lvl:4},{id:thorns,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');
    inventory_set(p,37,1,'diamond_leggings','{Enchantments:[{id:protection,lvl:4},{id:thorns,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');
    inventory_set(p,11,1,'diamond_leggings','{Enchantments:[{id:protection,lvl:4},{id:thorns,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');
    inventory_set(p,36,1,'diamond_boots','{Enchantments:[{id:protection,lvl:4},{id:feather_falling,lvl:4},{id:thorns,lvl:3},{id:depth_strider,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');
    inventory_set(p,12,1,'diamond_boots','{Enchantments:[{id:protection,lvl:4},{id:feather_falling,lvl:4},{id:thorns,lvl:3},{id:depth_strider,lvl:3},{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');

    inventory_set(p,8,1,'totem_of_undying');
    inventory_set(p,35,1,'totem_of_undying');
    inventory_set(p,26,1,'totem_of_undying');
    inventory_set(p,17,1,'totem_of_undying');

    inventory_set(p,5,16,'ender_pearl');
    inventory_set(p,32,16,'ender_pearl');

    inventory_set(p,6,16,'enchanted_golden_apple');
    inventory_set(p,33,64,'golden_apple');
    inventory_set(p,7,64,'golden_carrot');
    inventory_set(p,34,64,'chorus_fruit');

    inventory_set(p,31,1,'lava_bucket');
    inventory_set(p,4,1,'water_bucket');

    inventory_set(p,13,64,'cobweb');
    inventory_set(p,22,1,'flint_and_steel');

    iset(3, 'fishing_rod', '{Enchantments:[{id:unbreaking,lvl:3},{id:luck_of_the_sea,lvl:3},{id:lure,lvl:3},{id:mending,lvl:1}]}');
    iset(30, 'obsidian', '{}');
    iset(40, 'shield', '{Enchantments:[{id:unbreaking,lvl:3},{id:mending,lvl:1}]}');
    pot(19, 'minecraft:strong_poison');
    pot(24, 'minecraft:strong_healing');
    pot(27, 'minecraft:strong_strength');
    pot(18, 'minecraft:strong_strength');
    pot(23, 'minecraft:strong_swiftness');
);

iset(slot, name, nbt) -> (
    max = stack_limit(name);
    inventory_set(player(), slot, max, name, nbt);
);

pot(slot, name) -> (
    iset(slot, 'splash_potion', str('{Potion:"%s"}', name));
);