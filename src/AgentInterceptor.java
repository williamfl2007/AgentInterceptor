import java.lang.instrument.*;

public class AgentInterceptor {

	public static void premain(String args,Instrumentation inst) {
		System.out.println("Hello World Agent works fine!");
	}

	public static void agentmain(String agentArgs, Instrumentation inst) {
		System.out.println("Agent attached to running VM");
	}
}