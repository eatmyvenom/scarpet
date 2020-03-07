__command() -> (
    p = player();
    run(str('/effect give %s regeneration 5 255 true', p));
    run(str('/effect give %s glowing 5 255 true', p));
    run(str('/effect give %s saturation 5 255 true', p));
);