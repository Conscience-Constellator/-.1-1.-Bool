package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.Collection;

public interface Dubl$Bool
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Dubl$Bool.class,
		Clas_Rap.class);
	/*Dep done*/

	@Lin_DclAr
	boolean Dubl$Bool(double In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Dublg$Boolg(
			double[] From,
			boolean[] To)
		{
			for(int Indx=0;
				Indx<From.length;
				Indx+=1)
			{
				To[Indx]=(Dubl$Bool(
				From[Indx]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default boolean[] Dublg$Boolg(double[] In)
			{
				boolean[] Out=new boolean[In.length];
				Dublg$Boolg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Dublg$Boolg(
			Iterable<Double> From,
			Collection<Boolean> To)
		{
			for(double In:From)
			{To.add(Dubl$Bool(In));}
		}
}