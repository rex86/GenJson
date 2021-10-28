package zabbix;

import java.util.List;

public class ZabbixTemplate {
    String jsonrpc;
    String method;

    String auth;
    int id;

    public ZabbixTemplate(String jsonrpc,
                          String method,
                          List<ZabbixMain.Params> params,
                          String auth,
                          int id) {
        this.jsonrpc = jsonrpc;
        this.method = method;
        this.auth = auth;
        this.id = id;
    }

}
