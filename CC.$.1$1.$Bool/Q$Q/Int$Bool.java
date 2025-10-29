package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.Collection;

public interface Int$Bool
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Int$Bool.class,
		Clas_Rap.class);
	/*Dep done*/

	@Lin_DclAr
	boolean Int$Bool(int In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Intg$Boolg(
			int[] From,
			boolean[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Int$Bool(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default boolean[] Intg$Boolg(int[] In)
			{
				boolean[] Out=new boolean[In.length];
				Intg$Boolg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Intg$Boolg(
			Iterable<Integer> From,
			Collection<Boolean> To)
		{
			for(int In:From)
			{To.add(Int$Bool(In));}
		}
}