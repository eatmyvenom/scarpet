__command() -> (
    print('use /32k <tool> to make a 32k version of that tool');
);

diamond_pickaxe(player) -> (

    json = 'Enchantments:[{id:"unbreaking",lvl:32767},{id:"efficiency",lvl:32767},{id:"fortune",lvl:32767},{id:"mending",lvl:32767},{id:"vanishing_curse",lvl:1}]';

    run(str('give %s diamond_pickaxe{%s} 1', player, json));
);

diamond_sword(player) -> (
    json = 'Enchantments:[{id:"unbreaking",lvl:32767},{id:"looting",lvl:32767},{id:"efficiency",lvl:32767},{id:"sharpness",lvl:32767},{id:"sweeping",lvl:32767},{id:"smite",lvl:32767},{id:"fire_aspect",lvl:32767},{id:"mending",lvl:32767},{id:"vanishing_curse",lvl:1}]';

    run(str('give %s diamond_sword{%s} 1', player, json));
);