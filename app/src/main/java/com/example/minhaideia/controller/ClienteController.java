package com.example.minhaideia.controller;

import com.example.minhaideia.core.AppUtil;

public class ClienteController {

    String versaoApp;
    public ClienteController(){
       this.versaoApp = AppUtil.versaoAplicativo();
    }
}
