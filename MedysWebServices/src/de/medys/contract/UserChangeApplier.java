package de.medys.contract;

import java.util.function.Function;

import de.medys.server.User;

public class UserChangeApplier
{
	public static <S, T>  void setUser(Function<UserTO, User> setupTO, S userTO)
	{
		User t = (User) setupTO.apply((UserTO)userTO);
	}
}
