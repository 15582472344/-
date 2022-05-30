package com.stx.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.stx.vo.StuVo;

import java.util.ArrayList;
import java.util.List;

public class JsonDemo {
    public static void main(String[] args) {
        StuVo st = new StuVo();
       st.setAge(1);
       st.setName("TOM");
       st.setGender("男");
        JSONObject json = (JSONObject)JSONObject.toJSON(st);
        /*System.out.println(json.toString());*/
     //   实体List转Json
       List<StuVo> list = new ArrayList<>();
        StuVo st1= new StuVo();
        st1.setAge(1);
        st1.setName("TOM");
        st1.setGender("男");
        list.add(st);
        list.add(st1);
        JSONArray jsonArray = (JSONArray)JSONArray.toJSON(list);
        //将list转换成数组
        System.out.println("listJSON="+jsonArray.toString());
       // Json串转实体
        StuVo stdJson = JSONObject.parseObject(json.toString(), StuVo.class);
        System.out.println(stdJson);
     //   Json串转实体List
        List<StuVo> listTemp = JSONArray.parseArray(jsonArray.toString(), StuVo.class);
        System.out.println(listTemp);
    }
}
