__command() -> (
    // run('script load compasshandler');
    run('time set day');
    run('spreadplayers 0 0 4000 4500 false @a');
    run('gamemode survival @a');
    run('effect give @a saturation 20 255 true');
    run('recipe give @a *');
    run('clear @a');
    run('gamerule doInsomnia false');
    run('gamerule doTraderSpawning false');
    run('gamerule doLimitedCrafting false');
    run('/gamerule commandBlockOutput false');
    run('gamerule sendCommandFeedback false');
    run('/gamerule doPatrolSpawning false');
);

