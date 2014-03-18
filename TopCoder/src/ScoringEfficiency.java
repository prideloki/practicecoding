public class ScoringEfficiency {

	public double getPointsPerShot(String[] gameLog) {
		double points = 0.0;
		int goalsAtt = 0;
		int freeAtt = 0;
		for (int i = 0; i < gameLog.length; i++) {
			int spacePos = gameLog[i].indexOf(" ");
			String action = gameLog[i].substring(0, spacePos);
			String goal = gameLog[i].substring(spacePos + 1,
					gameLog[i].indexOf(" ", spacePos+1));
			
			if (goal.equals("free")) {
				if (action.equals("Made"))
					points += 1;
				freeAtt += 1;

			} else {
				if (action.equals("Made"))
					points += Integer.parseInt(goal);
				goalsAtt += 1;
			}

		}
		System.out.println(points/(goalsAtt+(0.5*freeAtt)));
		return points/(goalsAtt+(0.5*freeAtt));
	}

}
