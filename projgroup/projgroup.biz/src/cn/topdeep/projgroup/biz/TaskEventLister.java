/**
 * $Id$
 */
package cn.topdeep.projgroup.biz;

import org.jbpm.api.listener.EventListener;
import org.jbpm.api.listener.EventListenerExecution;
import org.jbpm.pvm.internal.env.*;

/**
 * @author niexin
 *
 */
public class TaskEventLister implements EventListener {

	/* (non-Javadoc)
	 * @see org.jbpm.api.listener.EventListener#notify(org.jbpm.api.listener.EventListenerExecution)
	 */
	public void notify(EventListenerExecution execution) throws Exception {
		System.out.println(execution.getName()+" @ "+ execution.getState());
//		Environment.getCurrent().get(name)
	}

}
