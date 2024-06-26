package vip.qoriginal.quantumplugin.patch;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.bukkit.entity.Player;
import org.eclipse.sisu.inject.BindingSubscriber;
import vip.qoriginal.quantumplugin.BindResponse;
import vip.qoriginal.quantumplugin.Request;

import javax.management.relation.Relation;
import java.util.Arrays;

import static vip.qoriginal.quantumplugin.JoinLeaveListener.prolist;

public class QueryBind {
    public static JsonObject PlayerinfoObj = new JsonObject();

    public static BindResponse queryPlayer(String name) throws Exception {
        String result = Request.sendGetRequest("http://127.0.0.1:8080/qo/download/registry?name=" + name);
        BindResponse relationship = new Gson().fromJson(result, BindResponse.class);
        return relationship;
    }
}
