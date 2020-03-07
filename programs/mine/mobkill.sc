__command() -> (
    print('mobkill command initalized.');
);

pillager() -> (
    run('kill @e[type=pillager]');
);

zombie() -> (
    run('kill @e[type=zombie]');f
);

item() -> (
    run('kill @e[type=item]');
);

remove(e) -> (
    modify(entity_selector(e),'remove');
);

removeLook() -> (
    modify(query(player(),'trace',60, 'entities'), 'remove');
);

__on_player_uses_item(p, it, hand) ->
(
    if(it)
);