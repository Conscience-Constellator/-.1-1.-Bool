package CC.$.Q$Q;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import java.util.Collection;

public interface Long$Bool
{
//	Clas_Rap Class=Init_StRt_Nd(Long$Bool.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	@Lin_DclAr
	boolean Long$Bool(long In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Longg$Boolg(
			long[] From,
			boolean[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Long$Bool(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default boolean[] Longg$Boolg(long[] In)
			{
				boolean[] Out=new boolean[In.length];
				Longg$Boolg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Longg$Boolg(
			Iterable<Long> From,
			Collection<Boolean> To)
		{
			for(long In:From)
			{To.add(Long$Bool(In));}
		}
}