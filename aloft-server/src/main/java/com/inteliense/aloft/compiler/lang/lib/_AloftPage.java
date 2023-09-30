package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleCss;
import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;

import java.util.ArrayList;

public abstract class _AloftPage {

    private String favicon = null;
    private String title = null;
    private ArrayList<AloftPage.Meta> meta = new ArrayList<>();
    private MountableComponent root;
    private AloftStyleCss css = new AloftStyleCss();



}
