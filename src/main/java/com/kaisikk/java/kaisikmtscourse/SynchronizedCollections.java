package com.kaisikk.java.kaisikmtscourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {

    // создание списки где все методы синхронизированные
    List list = Collections.synchronizedList(new ArrayList<>());

}
