package zabbix;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class JsonGen {
    public static void main(String[] args) {

        List<ApJsonGen.ZbxTemplate> templates = new ArrayList<>();
        templates.add(new ApJsonGen.ZbxTemplate("10186"));

        List<ApJsonGen.ZbxGroup> groups = new ArrayList<>();
        groups.add(new ApJsonGen.ZbxGroup("28"));
        groups.add(new ApJsonGen.ZbxGroup("25"));

        List<ApJsonGen.ZbxInterface> interfaces = new ArrayList<>();
        List<ApJsonGen.DeviceParam> deviceParams = new ArrayList<>();
        ApJsonGen.ZbxInterface if1 = new ApJsonGen.ZbxInterface("10.40.0.102");
        interfaces.add(if1);
//        interfaces.add(new ApJsonGen.ZbxInterface("10.40.0.100"));

        ApJsonGen.DeviceParam param1 = new ApJsonGen.DeviceParam("ap3jak",interfaces,groups,templates);
        deviceParams.add(param1);

//        interfaces.remove(if1);
//        if1 = new ApJsonGen.ZbxInterface("10.40.0.100");
//        interfaces.add(if1);

        param1 = new ApJsonGen.DeviceParam("ap1btkm",interfaces,groups,templates);
        deviceParams.add(param1);

        ApJsonGen apJsonGen = new ApJsonGen(deviceParams);

        System.out.println(new Gson().toJson(apJsonGen));
    }
}
