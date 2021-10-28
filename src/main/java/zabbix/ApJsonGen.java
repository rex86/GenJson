package zabbix;

import java.util.List;

public class ApJsonGen {
    final String jsonrpc = "2.0";
    final String method = "host.create";
    List<DeviceParam> deviceParamList;
    final String auth = "b64ea64d42cd6b9a26ff63922c6b9469";

    public ApJsonGen(List<DeviceParam> deviceParamList) {
        this.deviceParamList = deviceParamList;
    }

    final int id = 1;



    static class ZbxTemplate {
        String templateid;

        public ZbxTemplate(String templateid) {
            this.templateid = templateid;
        }
    }

    static class ZbxGroup {
        String groupid;

        public ZbxGroup(String groupid) {
            this.groupid = groupid;
        }
    }
    static class ZbxInterface {
        final int type = 1;
        final int main = 1;
        final int useip = 1;
        String ip;

        public void setIp(String ip) {
            this.ip = ip;
        }

        final String dns = "";
        final String port = "10050";

        public ZbxInterface(String ip) {
            this.ip = ip;
        }
    }
    static class DeviceParam {
        String host;
        List<ZbxInterface> interfaces;
        List<ZbxGroup> groups;
        List<ZbxTemplate> templates;

        public DeviceParam(String host, List<ZbxInterface> interfaces, List<ZbxGroup> groups, List<ZbxTemplate> templates) {
            this.host = host;
            this.interfaces = interfaces;
            this.groups = groups;
            this.templates = templates;
        }
    }

}
