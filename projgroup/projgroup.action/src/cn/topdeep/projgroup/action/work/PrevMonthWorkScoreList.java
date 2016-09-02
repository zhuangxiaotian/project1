/**
 * $Id$
 */
package cn.topdeep.projgroup.action.work;

import cn.topdeep.projgroup.action.BaseAction;

import java.sql.SQLException;
import java.util.*;
import cn.topdeep.projgroup.entity.*;


/**
 * @author niexin
 *
 */
public class PrevMonthWorkScoreList extends BaseAction {

	private List<VPrevMonthWorkScore> scoreList;

	/**
	 * @return the scoreList
	 */
	public List<VPrevMonthWorkScore> getScoreList() throws DbException, SQLException {
		if(scoreList == null){
			scoreList = getSystemBiz().vPrevMonthWorkScoreSelectObjects();
		}
		return scoreList;
	}
	
}
