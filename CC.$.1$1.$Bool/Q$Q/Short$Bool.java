package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import ststic CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.Collection;

public interface Short$Bool
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Short$Bool.class,
		Clas_Rap.class);
	/*Dep done*/

	@Lin_DclAr
	boolean Short$Bool(short In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Shortg$Boolg(
			short[] From,
			boolean[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Short$Bool(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default boolean[] Shortg$Boolg(short[] In)
			{
				boolean[] Out=new boolean[In.length];
				Shortg$Boolg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Shortg$Boolg(
			Iterable<Short> From,
			Collection<Boolean> To)
		{
			for(short In:From)
			{To.add(Short$Bool(In));}
		}
}