package zabbix;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ZabbixMain {
    public static void main(String[] args) throws IOException {

        File file = new File("apList_itk");
        List<String> lines = Files.readAllLines(Paths.get("apList_itk.txt"));


//        Ap ap;
//        List<Ap> apList = new ArrayList<>();
//        String json = new Gson().toJson(
//                new ZabbixTemplate("2.0",
//                        "host.create",
//                        "kjsdhfkjsdhfksjdhfsdkjfhdsjk3434",
//                        1));
//        System.out.println(json);
//        for (String item: lines) {
//            ap = new Ap();
//            ap.setName(item.split(" ")[0]);
//            ap.setIpAddress(item.split(" ")[1]);
//            apList.add(ap);
//        }

//        for (Ap apItem: apList) {
//            System.out.println("Ap name is: " + apItem.getName());
//            System.out.println("Ap ip address is: " + apItem.getIpAddress());
//
//        }
    }

    public static class Group {
        int groupid;

        public Group(int groupid) {
            this.groupid = groupid;
        }
    }

    public static class Interfaces {

        int type;
        int main;
        int useip;
        String ip;
        String dns;
        int port;

        public Interfaces(int type, int main, int useip, String ip, String dns, int port) {
            this.type = type;
            this.main = main;
            this.useip = useip;
            this.ip = ip;
            this.dns = dns;
            this.port = port;
        }
    }

    public static class Params {
        String host;
        List<Interfaces> interfaces;
        List<Group> groups;

    }
}
