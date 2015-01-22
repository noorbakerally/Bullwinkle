/*
  Copyright 2014 Sylvain Hallé
  Laboratoire d'informatique formelle
  Université du Québec à Chicoutimi, Canada
  
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  
      http://www.apache.org/licenses/LICENSE-2.0
  
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/
package ca.uqac.lif.bullwinkle;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ca.uqac.lif.bullwinkle.BnfParser.ParseException;

public class PathTest
{

  @Before
  public void setUp() throws Exception
  {
  }

  @Test
  public void test1() throws ParseException
  {
    BnfParser parser = GrammarTests.readGrammar("data/Grammar-0.bnf", "<S>", false);
    String expression = "SELECT a FROM t";
    ParseNode pn = parser.parse(expression);
    String path = "<S>.<selection>.<criterion>";
    List<ParseNode> result = NodePath.getPath(pn, path);
    //fail("Not yet implemented");
  }
  
  @Test
  public void test2() throws ParseException
  {
    BnfParser parser = GrammarTests.readGrammar("data/Grammar-0.bnf", "<S>", false);
    String expression = "SELECT a FROM t";
    ParseNode pn = parser.parse(expression);
    String path = "<S>.<selection>.*";
    List<ParseNode> result = NodePath.getPath(pn, path);
    //fail("Not yet implemented");
  }

}
