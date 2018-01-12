REMES IDE
=========
![banner](http://www.fer.unizg.hr/images/50008813/header(1).png)

**REMES** (REsource Model for Embeded Systems) is a behavioral modeling language supporting component-based embedded systems.
In REMES, the internal behavior of an embedded component is denoted by modes, atomic- or composite.
The mode’s discrete control is ensured by a control interface (entry- and exit points), while the data is transferred between
modes through a data interface. The control ﬂow is depicted by a set of edges, annotated with discrete actions,
whereas the resource-wise behavior of a component is expressed by mode annotations in form of the ﬁrst derivatives of the 
resource variables, which evolve at positive integer rates. The analysis of REMES-based systems is based on a weighted sum in
which the variables capture the accumulated consumption of resources.

![REMES mode image](http://www.fer.unizg.hr/images/50008813/HCController-REMES.png "REMES mode")
**REMES-IDE** is developed in cooperation between projects  [DICES](http://www.fer.unizg.hr/dices) and
[PROGRESS](http://www.mrtc.mdh.se/progress/). Its purpose is to support construction and analysis of embedded system behavioral models.
It consists of a set of tools such as REMES editor, automated transformations of REMES models into priced timed automata
for formal analysis and verification and REMES simulator that lets one test the timing and resource consumption of
embedded components during design.

**REMES Editor** is a graphical environment for behavior modeling of embedded components in the semantics of the REMES modeling language. Editor allows users to easily create REMES artifacts such as composite modes, submodes and conditional connectors. Submodes and conditional connectors can be nested inside composite modes. User deﬁnes the control ﬂow by creating edges between diagram elements. Action guards of the edges are deﬁned by in-place editing in the diagram. Basic checks are performed to prevent user from creating invalid models. User can deﬁne typed variables, constants and resources in separate sections within the modes. Remes diagram editor integrates with the Eclipse properties view, which displays and edits context sensitive information for the currently selected diagram element. This information can also be edited, e.g. to change variable type or the initialization clause of a mode. In addition, filters can be applied over the REMES diagram to outline specific aspect of the model - like behavior, timing or resource usage - and to outline specific aspects of the model.

Transformation of REMES models into priced timed automata (PTA) results in PTA models representing the same behavior. A graphical editor for resulting PTA models is provided, as a tool to visually inspect transformation results. Model files for both UPPAAL (timed automata) and UPPAAL Cora (priced timed automata) can be exported for verification and analysis.

The possibility to simulate and test the behaviors as they are being designed provide valuable input for the designer, and possibly uncover trouble spots before proceeding to full formal veriﬁcation. REMES-IDE transforms behaviors into a set of Java classes that simulate the modeled system. REMES simulator is still in early-stage development - the system designer can follow the mode transitions, the clock- and variable changes in the simulator output.

REMES-IDE can be integrated with [PROGRESS-IDE](http://www.idt.mdh.se/pride/) to facilitate development of component-based embedded systems using ProCom component model.

Links
=====
For more info, see:
- [REMES IDE website](http://www.fer.unizg.hr/dices/remes-ide)
- [DICES project](http://www.fer.unizg.hr/dices)
- [PROGRESS project](http://www.mrtc.mdh.se/progress/)
