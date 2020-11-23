package org.misha;

import org.apache.log4j.Logger;

public class Launcher {
    private static final Logger log = Logger.getLogger(Launcher.class);

    public static void main(String... args) {
        MyList<Integer> list = new MyLinkedList<>();
        log.debug(list);
        list.push(1);
        log.debug(list);
        list.push(2);
        log.debug(list);
        log.debug(list.pop());
        log.debug(list);
        list.push(5);
        log.debug(list);
        log.debug(list.insert(1, 11));
        log.debug(list);
        list.insert(0, 0);
        log.debug(list);
        log.debug(list.size());
    }
}
