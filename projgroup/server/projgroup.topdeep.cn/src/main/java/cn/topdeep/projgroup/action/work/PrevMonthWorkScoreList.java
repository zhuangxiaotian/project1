/**
 * $Id$
 */
package cn.topdeep.projgroup.action.work;

import cn.topdeep.projgroup.action.BaseAction;

import java.sql.SQLException;
import java.util.*;

import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.db.*;
import cn.topdeep.projgroup.entity.view.PrevMonthWorkScore;


/**
 * @author niexin
 *
 */
public class PrevMonthWorkScoreList extends BaseAction {

	private List<PrevMonthWorkScore> scoreList;

	/**
	 * @return the scoreList
	 */
	public List<PrevMonthWorkScore> getScoreList() throws DbException, SQLException {
		if(scoreList == null){
			scoreList = projectBiz.prevMonthWorkScoreSelectObjects();
		}
		return scoreList;
	}
	
}
