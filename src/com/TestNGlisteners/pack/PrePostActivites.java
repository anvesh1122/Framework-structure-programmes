package com.TestNGlisteners.pack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

import com.TestNGFrameworkUtilities.ScreenShots;

public class PrePostActivites implements ITestListener {

	public String Tcname;
	@Override
	public void onFinish(ITestContext res) {
	
		System.out.println("testcase is finished..........");
	}

	@Override
	public void onStart(ITestContext res) {
		System.out.println("testcase is start........");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult res) {
		
		System.out.println("testcase is failed with successPercentage.......");
		
	}

	@Override
	public void onTestFailure(ITestResult res) {
	
		try {
			ScreenShots.takeScreenShot(Tcname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("testcase is failure...");
		
	}

	@Override
	public void onTestSkipped(ITestResult res) {
	
		try {
			ScreenShots.takeScreenShot(Tcname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("testcases is skipped........");
		
	}

	@Override
	public void onTestStart(ITestResult res) {

		System.out.println("ontest case is starting........");
		
	}

	@Override
	public void onTestSuccess(ITestResult res){
	
		System.out.println("on testcases is sucesssful.....");
		
		
		
	}
}


