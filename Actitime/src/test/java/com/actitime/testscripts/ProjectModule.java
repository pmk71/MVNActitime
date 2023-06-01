package com.actitime.testscripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskList;

public class ProjectModule extends BaseClass {
@Test
public void createProject() {
	EnterTimeTrack ett=new EnterTimeTrack(driver);
	ett.getTasksTab().click();
	TaskList tl= new TaskList(driver);
	tl.getAddNewButton().click();
	tl.getNewProjectBtn().click();
	tl.getProjectNameTxf().sendKeys("Banking shark");
	tl.getCreateProjectbtn().click();
	
}
}
