
package nz.ac.aut.ense701.gameModel;


/**
 * Fauna at this point represents any species that is not a kiwi or a predator on the island.
 * If we need additional endangered species this class should have descendant classes created.
 * 
 * @author AS
 * @version July 2011
 */
public class Fauna extends Occupant
{
    

    /**
     * Constructor for objects of class Endangered
     * @param pos the position of the fauna
     * @param name the name of the fauna
     * @param description a longer description of the fauna
     * @param wikiDescription an article describing of the fauna
     */
    public Fauna(Position pos, String name, String description, String wikiDescription) 
    {
        super(pos, name, description, wikiDescription);
    } 
    
 


    @Override
    public String getStringRepresentation() 
    {
          return "F";
    }    
}
