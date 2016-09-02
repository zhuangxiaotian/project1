/**
 * $Id$
 */
package cn.topdeep.projgroup.action.home;

import cn.topdeep.projgroup.action.BaseAction;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import common.cache2.CacheException;
import common.dbvisit.DbException;
import common.util.SiteManage;
import common.util.SiteMapException;
import common.util.SiteMapProviderForAttribute;
import common.util.SiteUrl;
import common.util.StringUtils;


/**
 * @author niexin
 *
 */
public class Index extends BaseAction{

	private List<SiteUrl> menuList;

	/**
	 * @return the menuList
	 */
	public List<SiteUrl> getMenuList() throws SiteMapException, ParserConfigurationException, SAXException, IOException {
		if(menuList == null){
			SiteUrl r = getRoot();
			try{
				if(r != null){
					menuList = new ArrayList<SiteUrl>();
					menuList.addAll(r.getChildUrlList());
					filterMenuList(menuList);
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return menuList;
	}
	
	private void filterMenuList(List<SiteUrl> urlList){
		//System.out.println("urlList.size = "+urlList.size());
		for(int i=urlList.size()-1;i>=0;i--){
			SiteUrl item = urlList.get(i);
			item.setMenu(true);
			filterMenuList(item.getChildUrlList());
			if(!getLoginUser().hasPrivilege(item.getFunc(), item.getOperate())){
				//System.out.println("no privilege remove "+item.getName());
				urlList.remove(i);
			}else if(item.getChildUrlList().size() == 0 && StringUtils.isNullOrEmpty(item.getUrl())){
				//System.out.println("no child remove "+item.getName());
				urlList.remove(i);
			}
		}
	}
	private SiteUrl root;
	
	public SiteUrl getRoot() throws SiteMapException, ParserConfigurationException, SAXException, IOException {
		if(root == null){
			SiteManage sitemap = new SiteManage();
			root = sitemap.getRootUrl();
		}
		return root;
	}

}
