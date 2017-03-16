package com.base.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.po.MaintainList;
import com.base.po.MaintenanceList;
import com.base.service.RepairApproveService;

@Controller("repairApproveController")
@RequestMapping("/jsp")   //״̬������Ϊ13��ά��Ϊ14
public class RepairApproveController {
	
	@Autowired
	private RepairApproveService repairApproveService;
	
	//�������еı�����Ϣ
	   @RequestMapping("/getNoRepair.do")
	    public String getNoRepair(HttpServletRequest request,
		    HttpServletResponse response, ModelMap map) {
		   
		   Integer size = Integer.parseInt(request.getParameter("length"));		
			Integer startIndex = Integer.parseInt(request.getParameter("start"));
			Integer draw = Integer.parseInt(request.getParameter("draw"));	
			int order = Integer.valueOf(request.getParameter("order[0][column]"));//�к�
		    String orderDir = request.getParameter("order[0][dir]");//���򷽷�
		    String searchValue = request.getParameter("search[value]");
		
			// ��õ�ǰҳ��
			Integer pageindex = (startIndex / size + 1);
			
			MaintainList str=null;		
			str=repairApproveService.getRepairInfo("", "", pageindex, size, order, orderDir, searchValue, 13);
			JSONObject getObj = new JSONObject();
			getObj.put("draw", draw);
			getObj.put("recordsFiltered", str.getRecordsTotal());
			getObj.put("recordsTotal", str.getRecordsTotal());
			getObj.put("data", str.getData());
			response.setContentType("text/html;charset=UTF-8");

			try {
				response.getWriter().print(getObj.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		 	   
	   }
	   
   //������ͬ���ı�����Ϣ
	   @RequestMapping("/getAgreeRepair.do")
	    public String getAgreeRepair(HttpServletRequest request,
		    HttpServletResponse response, ModelMap map) {
		   Integer size = Integer.parseInt(request.getParameter("length"));		
			Integer startIndex = Integer.parseInt(request.getParameter("start"));
			Integer draw = Integer.parseInt(request.getParameter("draw"));	
			int order = Integer.valueOf(request.getParameter("order[0][column]"));//�к�
		    String orderDir = request.getParameter("order[0][dir]");//���򷽷�
		    String searchValue = request.getParameter("search[value]");
		
			// ��õ�ǰҳ��
			Integer pageindex = (startIndex / size + 1);
			
			MaintainList str=null;		
			str=repairApproveService.getRepairInfo("", "", pageindex, size, order, orderDir, searchValue, 14);
			JSONObject getObj = new JSONObject();
			getObj.put("draw", draw);
			getObj.put("recordsFiltered", str.getRecordsTotal());
			getObj.put("recordsTotal", str.getRecordsTotal());
			getObj.put("data", str.getData());
			response.setContentType("text/html;charset=UTF-8");

			try {
				response.getWriter().print(getObj.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;   
	   }	   
	 
	   
	 //���ɸѡ�������еı�����Ϣ
	   @RequestMapping("/getChooseRepair1.do")
	    public String getChooseRepair1(HttpServletRequest request,
		    HttpServletResponse response, ModelMap map) {
		   
		   Integer size = Integer.parseInt(request.getParameter("length"));		
			Integer startIndex = Integer.parseInt(request.getParameter("start"));
			Integer draw = Integer.parseInt(request.getParameter("draw"));	
			int order = Integer.valueOf(request.getParameter("order[0][column]"));//�к�
		    String orderDir = request.getParameter("order[0][dir]");//���򷽷�
		    String searchValue = request.getParameter("search[value]");
		   
		    String baseid = request.getParameter("baseid");
		    String username = request.getParameter("userid");
		    
			// ��õ�ǰҳ��
			Integer pageindex = (startIndex / size + 1);
			
			MaintainList str=null;		
			str=repairApproveService.getRepairInfo(baseid, username, pageindex, size, order, orderDir, searchValue, 13);
			JSONObject getObj = new JSONObject();
			getObj.put("draw", draw);
			getObj.put("recordsFiltered", str.getRecordsTotal());
			getObj.put("recordsTotal", str.getRecordsTotal());
			getObj.put("data", str.getData());
			response.setContentType("text/html;charset=UTF-8");

			try {
				response.getWriter().print(getObj.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;	   
	   }
	   
	 //���ɸѡ������ͬ��ı�����Ϣ
	   @RequestMapping("/getChooseRepair2.do")
	    public String getChooseRepair2(HttpServletRequest request,
		    HttpServletResponse response, ModelMap map) {
		   Integer size = Integer.parseInt(request.getParameter("length"));		
			Integer startIndex = Integer.parseInt(request.getParameter("start"));
			Integer draw = Integer.parseInt(request.getParameter("draw"));	
			int order = Integer.valueOf(request.getParameter("order[0][column]"));//�к�
		    String orderDir = request.getParameter("order[0][dir]");//���򷽷�
		    String searchValue = request.getParameter("search[value]");
		   
		    String baseid = request.getParameter("baseid");
		    String username = request.getParameter("userid");
		    
			// ��õ�ǰҳ��
			Integer pageindex = (startIndex / size + 1);
			
			MaintainList str=null;		
			str=repairApproveService.getRepairInfo(baseid, username, pageindex, size, order, orderDir, searchValue, 14);
			JSONObject getObj = new JSONObject();
			getObj.put("draw", draw);
			getObj.put("recordsFiltered", str.getRecordsTotal());
			getObj.put("recordsTotal", str.getRecordsTotal());
			getObj.put("data", str.getData());
			response.setContentType("text/html;charset=UTF-8");

			try {
				response.getWriter().print(getObj.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;		   
	   }
	   
	   //����걨�˺ͻ�����
	   @RequestMapping("/getInfoApply.do")
	    public String getInfoApply(HttpServletRequest request,
		    HttpServletResponse response, ModelMap map) {
		   List list=new ArrayList();
		   list=repairApproveService.getInfoApply();
		   JSONArray json = JSONArray.fromObject(list);
			response.setContentType("text/html;charset=UTF-8");

			try {
				response.getWriter().print(json.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;		   	   
	   } 	  
	   
	   //�ܾ�����
	   @RequestMapping("/refuseRepairApply.do")
	    public String refuseRepairApply(HttpServletRequest request,
		    HttpServletResponse response, ModelMap map) {
		   
		   String refusestr = request.getParameter("recordstr");
		   String infostr = request.getParameter("infostr");
		   repairApproveService.refuseRepairApply(refusestr,infostr);
		   
		   JSONObject getObj = new JSONObject();
			getObj.put("str", "成功拒绝申请");
			response.setContentType("text/html;charset=UTF-8");
			try {
			    response.getWriter().print(getObj.toString());
			} catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			return null;		   
	   }
	   
	   //ͬ������
	   @RequestMapping("/agreeRepairApply.do")
	    public String agreeRepairApply(HttpServletRequest request,
		    HttpServletResponse response, ModelMap map) {
		   
		   String agreestr = request.getParameter("agreestr");
		   String infostr = request.getParameter("infostr");
		   System.out.println(agreestr);
		   repairApproveService.agreeRepairApply(agreestr,infostr);
		   
		   JSONObject getObj = new JSONObject();
			getObj.put("str", "成功同意申请");
			response.setContentType("text/html;charset=UTF-8");
			try {
			    response.getWriter().print(getObj.toString());
			} catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			return null;	   
	   }
	   
	   //ά�����
	   @RequestMapping("/repairFinish.do")
	    public String repairFinish(HttpServletRequest request,
		    HttpServletResponse response, ModelMap map) {
		   String storestr = request.getParameter("recordstr");
		   String infostr = request.getParameter("infostr");		   
		   repairApproveService.finishRepairApply(storestr,infostr);
		   
		   JSONObject getObj = new JSONObject();
			getObj.put("str", "成功确认维修完成");
			response.setContentType("text/html;charset=UTF-8");
			try {
			    response.getWriter().print(getObj.toString());
			} catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			return null;	     
	   }
	   
}
