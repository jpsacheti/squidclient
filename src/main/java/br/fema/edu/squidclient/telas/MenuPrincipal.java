/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fema.edu.squidclient.telas;

import br.edu.fema.squidclient.service.AuthUserSquidService;
import br.edu.fema.squidclient.service.BlackListSquidService;
import br.edu.fema.squidclient.service.CacheSizeSquidService;
import br.edu.fema.squidclient.service.FileExtensionSquidService;
import br.edu.fema.squidclient.service.TimeRuleSquidService;
import br.edu.fema.squidclient.service.WhiteListSquidService;

/**
 *
 * @author joao
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    private final String url;
    private AuthUserSquidService authUserService;
    private BlackListSquidService blackListService;
    private CacheSizeSquidService cacheSquidService;
    private FileExtensionSquidService fileExtService;
    private TimeRuleSquidService timeRuleService;
    private WhiteListSquidService whiteListService;
    
    public MenuPrincipal(String url) {
        this.url = url;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        blackListMenu = new javax.swing.JMenu();
        ipBlacklistMenu = new javax.swing.JMenu();
        blackListIpAdd = new javax.swing.JMenuItem();
        blackListIpRemove = new javax.swing.JMenuItem();
        blackListIpList = new javax.swing.JMenuItem();
        blackListIpFlush = new javax.swing.JMenuItem();
        urlBlackListMenu = new javax.swing.JMenu();
        blackListUrlAdd = new javax.swing.JMenuItem();
        blackListUrlRemove = new javax.swing.JMenuItem();
        blackListUrlList = new javax.swing.JMenuItem();
        blackListUrlFlush = new javax.swing.JMenuItem();
        whiteListMenu = new javax.swing.JMenu();
        ipWhiteListMenu = new javax.swing.JMenu();
        whiteListIpAdd = new javax.swing.JMenuItem();
        whiteListIpRemove = new javax.swing.JMenuItem();
        whiteListIpList = new javax.swing.JMenuItem();
        whiteListIpFlush = new javax.swing.JMenuItem();
        urlWhiteListMenu = new javax.swing.JMenu();
        whiteListUrlAdd = new javax.swing.JMenuItem();
        whiteListUrlRemove = new javax.swing.JMenuItem();
        whiteListUrlList = new javax.swing.JMenuItem();
        whiteListUrlFlush = new javax.swing.JMenuItem();
        usuariosMenu = new javax.swing.JMenu();
        usuarioAdd = new javax.swing.JMenuItem();
        usuarioRemove = new javax.swing.JMenuItem();
        usuarioList = new javax.swing.JMenuItem();
        usuarioFlush = new javax.swing.JMenuItem();
        timeRuleMenu = new javax.swing.JMenu();
        timeRuleAdd = new javax.swing.JMenuItem();
        timeRuleRemove = new javax.swing.JMenuItem();
        timeRuleList = new javax.swing.JMenuItem();
        timeRuleFlush = new javax.swing.JMenuItem();
        cacheMenu = new javax.swing.JMenu();
        cacheSizeAdd = new javax.swing.JMenuItem();
        cacheSizeFlush = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        blackListMenu.setMnemonic('f');
        blackListMenu.setText("Blacklist");

        ipBlacklistMenu.setText("IP");

        blackListIpAdd.setText("Adicionar");
        ipBlacklistMenu.add(blackListIpAdd);

        blackListIpRemove.setText("Remover");
        ipBlacklistMenu.add(blackListIpRemove);

        blackListIpList.setText("Listar");
        ipBlacklistMenu.add(blackListIpList);

        blackListIpFlush.setText("Limpar tudo");
        ipBlacklistMenu.add(blackListIpFlush);

        blackListMenu.add(ipBlacklistMenu);

        urlBlackListMenu.setText("URL");

        blackListUrlAdd.setText("Adicionar");
        urlBlackListMenu.add(blackListUrlAdd);

        blackListUrlRemove.setText("Remover");
        urlBlackListMenu.add(blackListUrlRemove);

        blackListUrlList.setText("Listar");
        urlBlackListMenu.add(blackListUrlList);

        blackListUrlFlush.setText("Limpar tudo");
        urlBlackListMenu.add(blackListUrlFlush);

        blackListMenu.add(urlBlackListMenu);

        menuBar.add(blackListMenu);

        whiteListMenu.setMnemonic('e');
        whiteListMenu.setText("Whitelist");

        ipWhiteListMenu.setText("IP");

        whiteListIpAdd.setText("Adicionar");
        ipWhiteListMenu.add(whiteListIpAdd);

        whiteListIpRemove.setText("Remover");
        ipWhiteListMenu.add(whiteListIpRemove);

        whiteListIpList.setText("Listar");
        ipWhiteListMenu.add(whiteListIpList);

        whiteListIpFlush.setText("Limpar tudo");
        ipWhiteListMenu.add(whiteListIpFlush);

        whiteListMenu.add(ipWhiteListMenu);

        urlWhiteListMenu.setText("URL");

        whiteListUrlAdd.setText("Adicionar");
        urlWhiteListMenu.add(whiteListUrlAdd);

        whiteListUrlRemove.setText("Remover");
        urlWhiteListMenu.add(whiteListUrlRemove);

        whiteListUrlList.setText("Listar");
        urlWhiteListMenu.add(whiteListUrlList);

        whiteListUrlFlush.setText("Limpar tudo");
        urlWhiteListMenu.add(whiteListUrlFlush);

        whiteListMenu.add(urlWhiteListMenu);

        menuBar.add(whiteListMenu);

        usuariosMenu.setMnemonic('h');
        usuariosMenu.setText("Usuarios");

        usuarioAdd.setText("Adicionar");
        usuariosMenu.add(usuarioAdd);

        usuarioRemove.setText("Remover");
        usuariosMenu.add(usuarioRemove);

        usuarioList.setText("Listar");
        usuariosMenu.add(usuarioList);

        usuarioFlush.setText("Limpar tudo");
        usuariosMenu.add(usuarioFlush);

        menuBar.add(usuariosMenu);

        timeRuleMenu.setText("Regra de tempo");

        timeRuleAdd.setText("Adicionar");
        timeRuleMenu.add(timeRuleAdd);

        timeRuleRemove.setText("Remover");
        timeRuleMenu.add(timeRuleRemove);

        timeRuleList.setText("Listar");
        timeRuleMenu.add(timeRuleList);

        timeRuleFlush.setText("Limpar tudo");
        timeRuleMenu.add(timeRuleFlush);

        menuBar.add(timeRuleMenu);

        cacheMenu.setText("Cache");

        cacheSizeAdd.setText("Configurar");
        cacheMenu.add(cacheSizeAdd);

        cacheSizeFlush.setText("Limpar");
        cacheMenu.add(cacheSizeFlush);

        menuBar.add(cacheMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem blackListIpAdd;
    private javax.swing.JMenuItem blackListIpFlush;
    private javax.swing.JMenuItem blackListIpList;
    private javax.swing.JMenuItem blackListIpRemove;
    private javax.swing.JMenu blackListMenu;
    private javax.swing.JMenuItem blackListUrlAdd;
    private javax.swing.JMenuItem blackListUrlFlush;
    private javax.swing.JMenuItem blackListUrlList;
    private javax.swing.JMenuItem blackListUrlRemove;
    private javax.swing.JMenu cacheMenu;
    private javax.swing.JMenuItem cacheSizeAdd;
    private javax.swing.JMenuItem cacheSizeFlush;
    private javax.swing.JMenu ipBlacklistMenu;
    private javax.swing.JMenu ipWhiteListMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem timeRuleAdd;
    private javax.swing.JMenuItem timeRuleFlush;
    private javax.swing.JMenuItem timeRuleList;
    private javax.swing.JMenu timeRuleMenu;
    private javax.swing.JMenuItem timeRuleRemove;
    private javax.swing.JMenu urlBlackListMenu;
    private javax.swing.JMenu urlWhiteListMenu;
    private javax.swing.JMenuItem usuarioAdd;
    private javax.swing.JMenuItem usuarioFlush;
    private javax.swing.JMenuItem usuarioList;
    private javax.swing.JMenuItem usuarioRemove;
    private javax.swing.JMenu usuariosMenu;
    private javax.swing.JMenuItem whiteListIpAdd;
    private javax.swing.JMenuItem whiteListIpFlush;
    private javax.swing.JMenuItem whiteListIpList;
    private javax.swing.JMenuItem whiteListIpRemove;
    private javax.swing.JMenu whiteListMenu;
    private javax.swing.JMenuItem whiteListUrlAdd;
    private javax.swing.JMenuItem whiteListUrlFlush;
    private javax.swing.JMenuItem whiteListUrlList;
    private javax.swing.JMenuItem whiteListUrlRemove;
    // End of variables declaration//GEN-END:variables

}